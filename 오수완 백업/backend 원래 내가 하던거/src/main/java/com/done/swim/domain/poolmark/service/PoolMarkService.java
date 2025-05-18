package com.done.swim.domain.poolmark.service;

import com.done.swim.domain.pool.entity.Pool;
import com.done.swim.domain.pool.repository.PoolRepository;
import com.done.swim.domain.poolmark.dto.PoolMarkListResponseDto;
import com.done.swim.domain.poolmark.entity.PoolMark;
import com.done.swim.domain.poolmark.repository.PoolMarkRepository;
import com.done.swim.domain.user.entity.User;
import com.done.swim.domain.user.repository.UserRepository;
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
  private final UserRepository userRepository;

  @Transactional
  public void createPoolMark(Long poolId) {
    Pool pool = fetchPool(poolId);

    // TODO: 토큰 구현이 안되어있어서 임시로(토큰 구현 후에는 User를 파라미터로 받을 예정)
    User user = userRepository.findById(2L)
      .orElseThrow(() -> new IllegalArgumentException("유저가 없습니다."));

    PoolMark alreadyMarkedPool = poolMarkRepository.findByUserAndPool(user, pool);

    if (alreadyMarkedPool != null) {
      throw new IllegalStateException("이미 찜한 수영장입니다.");
    }

    PoolMark poolMark = PoolMark.builder().user(user).pool(pool).build();
    poolMarkRepository.save(poolMark);
  }

  public PoolMarkListResponseDto getMyPoolMark(Pageable pageable) {
    // TODO: user 변경할 예정
    Page<PoolMark> poolMarkPage = poolMarkRepository.findByUserId(2L, pageable);

    return PoolMarkListResponseDto.from(poolMarkPage);
  }

  @Transactional
  public void deleteMyPoolMark(Long poolId) {
    Pool pool = fetchPool(poolId);

    // TODO: 토큰 구현이 안되어있어서 임시로(토큰 구현 후에는 User를 파라미터로 받을 예정)
    User user = userRepository.findById(2L)
      .orElseThrow(() -> new IllegalArgumentException("유저가 없습니다."));

    PoolMark alreadyMarkedPool = poolMarkRepository.findByUserAndPool(user, pool);

    if (alreadyMarkedPool == null) {
      throw new IllegalStateException("찜한 수영장이 없습니다.");
    }

    if (alreadyMarkedPool.getUser().getId() != user.getId()) {
      throw new IllegalStateException("권한이 없습니다.");
    }

    log.info("id {}", alreadyMarkedPool.getId());
    poolMarkRepository.deleteById(alreadyMarkedPool.getId());
  }

  private Pool fetchPool(Long poolId) {
    return poolRepository.findById(poolId)
      .orElseThrow(() -> new IllegalArgumentException("수영장이 없습니다."));
  }
}
