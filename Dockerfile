FROM ubuntu:16.10

RUN apt-get update && apt-get install -y \
  curl

RUN echo "deb [arch=amd64] http://storage.googleapis.com/bazel-apt testing jdk1.8" \
  >  /etc/apt/sources.list.d/bazel.list
RUN curl https://bazel.build/bazel-release.pub.gpg | apt-key add -

RUN apt-get update && apt-get install -y \
  bazel \
  rng-tools

RUN /etc/init.d/rng-tools start

RUN useradd -m s
USER s
WORKDIR /home/s/fred
