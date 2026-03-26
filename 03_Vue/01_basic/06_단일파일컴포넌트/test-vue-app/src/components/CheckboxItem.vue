<template>
  <li><input type="checkbox" v-model="checked" /> 옵션</li>
</template>

<script setup>
import { ref } from 'vue';

const checked = ref(false);

</script>

<!-- <script>
import { ref } from 'vue';
export default {
  name: 'CheckboxItem',
  setup() {
    const checked = ref(false);

    return {
      checked
    }
  },
};
</script> -->

<style lang="scss" scoped></style>
