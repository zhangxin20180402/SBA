# Set nginx base image
FROM nginx

# File Author / Maintainer
MAINTAINER ZhangXin

COPY ./dist/UI/ /usr/share/nginx/html/

COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]