<template>
  <div>
    <div class="container">
      <h1>Vue CSS 스타일 방법</h1>
      <!-- 전역 CSS -->
      <GlobalCssDemo />

      <!-- Scoped CSS -->
      <ScopedCssDemo />

      <!-- CSS Module -->
      <CssModuleDemo />
    </div>
  </div>
</template>

<script setup>
import CssModuleDemo from './components/CssModuleDemo.vue';
import GlobalCssDemo from './components/GlobalCssDemo.vue';
import ScopedCssDemo from './components/ScopedCssDemo.vue';
</script>

<!-- 전역 -->
<!-- 보통은 App.vue 레이아웃 잡는데 사용 -->
<style>
.container {
  max-width: 600px;
  margin: auto;
}
</style>
