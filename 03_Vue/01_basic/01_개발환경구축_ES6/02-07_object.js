// 객체 구조분해할당

const user = {
  name: 'Alice',
  age: 25,
  job: 'Developer',
  info: {
    address: 'Seoul',
    hobbies: ['reading', 'coding'],
  },
};

// 객체 속성명을 다르게 사용하고 싶을 때
const { name: userName, age: ageNo, ...rest } = user;

// console.log(ageNo);
// console.log(userName);
// console.log(rest);

// 중첩된 객체 구조분해
const {
  name,
  age,
  info: {
    address,
    hobbies: [firstHobby, secondHobby],
  },
} = user;

console.log(address);
console.log(firstHobby);
console.log(secondHobby);
