<template>
  <li><input type="checkbox" :checked="idol.checked" /> {{ idol.name }}</li>
</template>

<script setup>
// defineProps : 부모요소에서 전달받은 Props를 정의하는 함수
defineProps({
  idol: {
    type: Object,
    required: true,

    // Vue 공식기능
    // 부모가 props를 전달할 때마다 함수가 호출
    // 반환되는 값이 false일 경우, console에 경고 호출
    validator: (value) => {
      return (typeof value.id === 'number' || typeof value.id === 'string') &&
        typeof value.name === 'string' &&
        typeof value.checked === 'boolean';
    },
  },
});
</script>

<style lang="scss" scoped></style>
