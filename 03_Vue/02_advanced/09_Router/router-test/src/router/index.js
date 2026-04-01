import About from '@/pages/About.vue';
import Home from '@/pages/Home.vue';
import MemberInfo from '@/pages/MemberInfo.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';
import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',
      component: About,
    },
    {
      path: '/members',
      name: 'members',
      component: Members,
    },
    {
      path: '/videos',
      name: 'videos',
      component: Videos,
    },
    {
      path: '/members/:id',
      name: 'members/id',
      component: MemberInfo,
    },
  ],
});

export default router;
