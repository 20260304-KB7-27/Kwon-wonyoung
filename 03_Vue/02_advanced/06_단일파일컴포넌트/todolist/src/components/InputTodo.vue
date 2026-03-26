<template>
  <div class="input-group">
    <input
      id="msg"
      type="text"
      name="msg"
      placeholder="할 일을 여기에 입력!"
      class="form-control"
      v-model.trim="todo"
      @keyup.enter="addTodo"
      @keyup.ctrl.enter="addTodo"
    />
    <span @click="addTodo" class="btn btn-primary input-group-addon">추가</span>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const todo = ref('');

const emit = defineEmits(['add']);


const addTodo = (e) => {
  if (todo.value === '') return;

  // emit을 해.
  emit('add', {
    id: new Date().getTime(),
    todo: todo.value,
    completed: e.ctrlKey ? true : false,
  });

  todo.value = '';
};
</script>

<style lang="scss" scoped></style>
