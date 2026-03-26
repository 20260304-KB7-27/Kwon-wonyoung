<template>
  <div>
    <input type="checkbox" :value="id" :checked="checked" @change="onChange" />
    <!-- 부모에서 정의한 템플릿 요소들이 들어오는 장소 -->
    <slot>
      <!-- 부모에서 템플릿 정의가 ㅇ벗는 경우 표시될 기본값 -->
      {{ label }}
    </slot>
  </div>
</template>

<script setup>
const props = defineProps(['id', 'checked', 'label']);

const emit = defineEmits(['check-changed']);

const onChange = (event) => {
  emit('check-changed', { id: props.id, checked: event.target.checked });
};
</script>

<style lang="scss" scoped></style>
