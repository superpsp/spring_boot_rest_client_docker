# wsl -d Ubuntu
cd /mnt/c/PSP/Projects/REST_Docker/SpringBootRestClient/
cp target/*.jar .
docker-compose -p springboot-rest-client up
