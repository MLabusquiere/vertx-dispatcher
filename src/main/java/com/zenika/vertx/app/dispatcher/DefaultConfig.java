/*
 * Copyright 2014 Zenika
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.zenika.vertx.app.dispatcher;

/**
 * @author M. Labusquière
 */
public interface DefaultConfig {

	public static final int DEFAULT_PORT = 8090;
	public static final long DEFAULT_TIME_OUT = 1000L;
	//SSL
	public static final boolean DEFAULT_IS_SSL = false;
	public static final boolean DEFAULT_IS_SSL_MANDATORY = false;
	public static final String DEFAULT_KEYSTORE_PATH = "server-keystore.jks";
	public static final String DEFAULT_KEYSTORE_PWD= "wibble";
}
