<template>
  <div class="card card-body">
    <div>
      <img :src="member.photo" style="width: 80px; height: 110px" />
    </div>
    <div>{{ member.name }}({{ member.role }})</div>
    <div>{{ member.desc }}</div>
    <div>
      <a
        v-if="member.insta && member.insta !== ''"
        class="fa fa-instagram m-1"
        :href="member.insta"
      ></a>
      <a
        v-if="member.facebook && member.facebook !== ''"
        class="fa fa-facebook m-1"
        :href="member.facebook"
      ></a>
      <a
        v-if="member.youtube && member.youtube !== ''"
        class="fa fa-youtube m-1"
        :href="member.youtube"
      ></a>
    </div>
    <RouterLink to="/members">멤버 목록으로</RouterLink>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
import members from '@/members.json';

const route = useRoute();
const memberId = Number(route.params.id);
const member = members.find((m) => m.id === memberId);
</script>

<style scoped></style>
