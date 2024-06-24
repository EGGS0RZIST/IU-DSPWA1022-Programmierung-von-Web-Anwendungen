export function getRandomWord(length: number): string {
  const word = Array.from({ length }, () => {
    const charCode = Math.floor(Math.random() * 26) + 97;
    return String.fromCharCode(charCode);
  }).join("");
  return word;
}

export function getRandomFloat(min: number, max: number): number {
  return Math.random() * (max - min) + min;
}
