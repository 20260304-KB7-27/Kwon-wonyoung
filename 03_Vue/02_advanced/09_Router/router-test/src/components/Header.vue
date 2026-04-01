<template>
  <nav class="navbar navbar-expand-lg bg-body-secondary">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">이날치(LeeNalChi)</a>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarNav"
        aria-controls="navbarNav"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <RouterLink to="/">
            <li class="nav-item">
              <a class="nav-link" aria-current="page">홈</a>
            </li>
          </RouterLink>
          <RouterLink to="/about">
            <li class="nav-item">
              <a class="nav-link" aria-current="page">소개</a>
            </li>
          </RouterLink>
          <RouterLink to="/members">
            <li class="nav-item">
              <a class="nav-link" aria-current="page">멤버</a>
            </li>
          </RouterLink>
          <RouterLink to="/videos">
            <li class="nav-item">
              <a class="nav-link" aria-current="page">영상</a>
            </li>
          </RouterLink>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script setup></script>

<style scoped>
a {
  text-decoration: none !important;
}
</style>
