/*
 * Copyright (c) 2014-2015 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 2018, 2019 Eclipse Krazo committers and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.eclipse.krazo.test.requestdispatcher;

import java.io.Serializable;
import jakarta.mvc.Controller;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

/**
 * RequestDispatcher defaulting sample.
 *
 * @author Manfred Riem
 */
@Path("requestDispatcher")
public class RequestDispatcherController implements Serializable {

    private static final long serialVersionUID = -5489226641437501938L;

    /**
     * MVC controller to render a book in HTML.
     * @param id ID of the book given in URI.
     * @return JSP page used for rendering.
     */
    @GET
    @Controller
    @Produces("text/html")
    @Path("view1/{id}")
    public String view1(@PathParam("id") String id) {
        return "/requestDispatcher";
    }
}
