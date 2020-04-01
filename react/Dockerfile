# Dockerfile
FROM node:carbon-alpine as builder
RUN mkdir /opt/app
WORKDIR /opt/app
COPY . ./
RUN yarn; yarn build

FROM nginx:alpine
COPY --from=builder /opt/app/build /usr/share/nginx/html

CMD ["nginx", "-g", "daemon off;"]