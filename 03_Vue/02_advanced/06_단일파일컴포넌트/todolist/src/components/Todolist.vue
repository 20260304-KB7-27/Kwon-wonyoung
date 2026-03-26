<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <TodolistItem
          v-for="todoitem in todolist"
          :key="todoitem.id"
          :todoitem="todoitem"
          @toggle="toggleCompleted"
          @delete="deleteTodo"
        />
      </ul>
    </div>
  </div>
</template>

<script setup>
import TodolistItem from './TodolistItem.vue';

const props = defineProps({
  todolist: Array,
});

// App 컴포넌트로 보내는 email
const emit = defineEmits(['toggle', 'delete']);

const toggleCompleted = (id) => {
  emit('toggle', id);
};
const deleteTodo = (id) => {
  emit('delete', id);
};
</script>

<style lang="scss" scoped></style>
