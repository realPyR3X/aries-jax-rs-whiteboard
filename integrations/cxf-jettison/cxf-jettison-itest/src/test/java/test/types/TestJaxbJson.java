/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.types;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.osgi.annotation.bundle.Requirement;

@Requirement(filter = "(osgi.jaxrs.name=cxf.jettison)", namespace = "osgi.service")
public class TestJaxbJson {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/jaxbjson")
    public DataObject getJsonObject() {
        DataObject dataObject = new DataObject();

        dataObject.setValue("value");

        return dataObject;
    }

}