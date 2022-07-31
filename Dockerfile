FROM sebp/elk:7.17.1

ADD ./02-beats-input.conf /etc/logstash/conf.d/02-beats-input.conf
ADD ./30-output.conf /etc/logstash/conf.d/30-output.conf