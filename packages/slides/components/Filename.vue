<template>
  <span
    class="font-mono text-xs text-black bg-[#d5d5d5] pt-1 px-[6px] pb-4 block -mb-[17px] border-l-[2px] rounded-tr"
    :style="{
      borderColor: borderColor,
    }"
  >
    <slot></slot>
  </span>
</template>

<script>
export default {
  props: {
    borderColor: {
      type: String,
      default: "#4287f5",
    },
  },
};
</script>
