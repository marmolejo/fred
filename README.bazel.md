To build with Bazel and Docker, just run the following commands (you need to
have Docker installed):

```
docker build . -t fred
docker run --privileged -it --net=host -v $(pwd):/home/s/fred fred bazel run :fred
```
