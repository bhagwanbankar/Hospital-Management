FROM node:alpine as BUILD
WORKDIR '/app'
COPY package.json .
RUN npm install
COPY . .
RUN npm run build

FROM nginx:1.17.10
EXPOSE 80
COPY --from=BUILD /app/dist/Hospital-Angular /usr/share/nginx/html
