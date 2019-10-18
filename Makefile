HOME = home/michail

NAMENODE_CURRENT = home/michail/hdata/namenode/current
DATANODE_CURRENT = home/michail/hdata/datanode/current
OUTPUT = $(HOME)/gitwatch/lab2-Darovskaya/output
TARGET = $(HOME)/gitwatch/lab2-Darovskaya/target
T_ONTIME = $(HOME)/gitwatch/lab2-Darovskaya/src/main/resources/664600583_T_ONTIME_sample.csv
AIROPORT_ID = $(HOME/)gitwatch/lab2-Darovskaya/src/main/resources/L_AIROPORT_ID.csv


.PHONY: all hadoop_stage launch_stage clean


all: hadoop_stage launch_stage

hadoop_stage:
	hdfs namenode -format
	start-dfs.sh
	start-yarn.sh

launch_stage:
	mvn package
	hadoop fs -mkdir /user
	hadoop fs -mkdir /user/michail
	hadoop fs -copyFromLocal $(AIROPORT_ID) $(T_ONTIME)
	export HADOOP_CLASSPATH=$(TARGET)/hadoop-examples-1.0-SNAPSHOT.jar
	hadoop JoinJob 664600583_T_ONTIME_sample.csv L_AIRPORT_ID.csv output
	hadoop fs -copyToLocal output

clean:
	stop-yarn.sh
	stop-dfs.sh
	rm -rf  $(DATANODE_CURRENT) $(NAMENODE_CURRENT) $(TARGET) $(OUTPUT)
