<template>
  <div>X : <input type="text" v-model.number="x" /><br /></div>
  <div>결과: {{ result }}</div>
</template>

<script setup>
import { ref, watch } from 'vue';

const x = ref(10);
const result = ref(20);

watch(x, (current, old) => {
  console.log(`${old} -> ${current}`);

  // computed: 계산 결과를 반환하는 파생값 -> 템플릿 표시용
  // watch: 변화에 반응하는 side Effect -> API 호출, 로깅, 감시대상이 아닌 다른 상태값을 변경하고 싶을때
  result.value = x.value * 2;
});
</script>

<style scoped></style>
