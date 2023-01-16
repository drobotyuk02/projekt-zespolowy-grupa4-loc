import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
	build: {
		lib: {
			entry: resolve(__dirname, 'src/main.jsx'),
			name: 'A name?'
			fileName: 'bookly-lib',
		},
		rollupOptions: {
			external: ['react'],
			output: {
				globals: {
					react: 'React',
				}
			}
		}
	},
  plugins: [react()],
})
