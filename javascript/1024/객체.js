const person = {
  name: 'John',
  friends: ['Jane', 'Mike'],

  printFriends_wrong() {
    this.friends.forEach(
      function (friend) {
      console.log(this.name + ' knows ' + friend); // this는 window
    }
  );
  },

  printFriends_right() {
    this.friends.forEach((friend) => {
      console.log(this.name + ' knows ' + friend); // 정상 작동
    });
  },
};

person.printFriends_wrong();
person.printFriends_right();
