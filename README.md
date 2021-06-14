# ss-core
ss

# Skywalking
-javaagent:F:\Java_work\ss-core\ss-skywalking\agent\skywalking-agent.jar
-Dskywalking.agent.service_name=ss-member
-Dskywalking.collector.backend_service=127.0.0.1:11800
-Dskywalking.lugin.mysql.trace_sql_parameters=true

# 启动sentinel
java -Dserver.port=8080  -Dcsp.sentinel.dashboard.server=localhost:8080  -jar sentinel-dashboard-1.8.1.jar