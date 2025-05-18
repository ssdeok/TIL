package com.done.swim.domain.poolmark.service;

import com.done.swim.domain.pool.entity.Pool;
import com.done.swim.domain.pool.repository.PoolRepository;
import com.done.swim.domain.poolmark.dto.PoolMarkListResponseDto;
import com.done.swim.domain.poolmark.entity.PoolMark;
import com.done.swim.domain.poolmark.repository.PoolMarkRepository;
import com.done.swim.domain.user.entity.User;
import com.done.swim.global.exception.ErrorCode;
import com.done.swim.global.exception.ForBiddenException;
import com.done.swim.global.exception.GlobalException;
import com.done.swim.global.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PoolMarkService {

  private final PoolMarkRepository poolMarkRepository;
  private final PoolRepository poolRepository;

  @Transactional
  public void createPoolMark(Long poolId, User user) {
    Pool pool = fetchPool(poolId);

    PoolMark alreadyMarkedPool = poolMarkRepository.findByUserAndPool(user, pool);

    if (alreadyMarkedPool != null) {
      throw new GlobalException(ErrorCode.ALREADY_MARK);
    }

    PoolMark poolMark = PoolMark.builder().user(user).pool(pool).build();
    poolMarkRepository.save(poolMark);
  }

  public PoolMarkListResponseDto getMyPoolMark(Pageable pageable, Long userId) {
    Page<PoolMark> poolMarkPage = poolMarkRepository.findByUserId(userId, pageable);

    return PoolMarkListResponseDto.from(poolMarkPage);
  }

  @Transactional
  public void deleteMyPoolMark(Long poolId, User user) {
    Pool pool = fetchPool(poolId);

    PoolMark alreadyMarkedPool = poolMarkRepository.findByUserAndPool(user, pool);

    if (alreadyMarkedPool == null) {
      throw new GlobalException(ErrorCode.NOT_MARK);
    }

    if (alreadyMarkedPool.getUser().getId() != user.getId()) {
      throw new ForBiddenException(ErrorCode.AUTHOR_ONLY);
    }

    poolMarkRepository.deleteById(alreadyMarkedPool.getId());
  }

  private Pool fetchPool(Long poolId) {
    return poolRepository.findById(poolId)
      .orElseThrow(() -> new ResourceNotFoundException(ErrorCode.POOL_NOT_FOUND));
  }
}
