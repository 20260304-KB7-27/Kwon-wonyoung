<template>
  <div>
    <label for="">{{ label }}</label>

    <input
      type="text"
      :value="modelValue"
      :placeholder="placeholder"
      @input="emit('update:modelValue', $event.target.value)"
    />
  </div>
</template>

<script setup>
const props = defineProps(['modelValue', 'label', 'placeholder']);

const emit = defineEmits(['update:modelValue']);
</script>

<style scoped></style>
