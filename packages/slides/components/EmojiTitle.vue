<template>
  <div class="flex flex-row items-baseline">
    <div>
      <span class="text-[3.75rem] mr-4">{{ emoji }}</span>
    </div>
    <div class="max-w-[36rem]">
      <h1>{{ title }}</h1>

      <span class="text-muted">
        <slot></slot>
      </span>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    emoji: {
      type: String,
      required: true,
    },
    title: {
      type: String,
      required: true,
    },
  },
};
</script>
