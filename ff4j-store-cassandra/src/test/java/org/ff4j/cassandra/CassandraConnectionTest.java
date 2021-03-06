package org.ff4j.cassandra;

/*
 * #%L
 * ff4j-store-cassandra
 * %%
 * Copyright (C) 2013 - 2016 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.ff4j.FF4j;
import org.ff4j.cassandra.store.FeatureStoreCassandra;

public class CassandraConnectionTest {

    public void testConnection() {
        
        CassandraConnection conn = new CassandraConnection();
        conn.createSchema();
        
        FF4j ff4j = new FF4j();
        ff4j.setFeatureStore(new FeatureStoreCassandra(conn));

        ff4j.getFeatureStore().exist("f1");
        
        conn.close();
    }
    
}
