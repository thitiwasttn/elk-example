FROM sebp/elk:7.17.1

RUN apt-get update && apt-get install nano

ADD ./02-beats-input.conf /etc/logstash/conf.d/02-beats-input.conf
ADD ./30-output.conf /etc/logstash/conf.d/30-output.conf