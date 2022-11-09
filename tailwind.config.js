/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["public/js/main.js"],
  theme: {
    extend: {},
  },
  plugins: [    require('@tailwindcss/forms'),
  require('@tailwindcss/aspect-ratio'),
  require('@tailwindcss/typography')],
}
