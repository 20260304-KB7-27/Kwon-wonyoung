<template>
  <div class="card card-body">
    <h2>Home</h2>
    <div>요청 경로: {{ route.path }}</div>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';

const route = useRoute();
</script>

<style scoped></style>
