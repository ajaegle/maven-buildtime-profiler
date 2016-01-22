package com.soebes.maven.extensions;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * @author Karl Heinz Marbaise <khmarbaise@apache.org>
 *
 */
public class SystemTime
{

    private long startTime;

    private long stopTime;

    public SystemTime()
    {
    }

    public SystemTime start()
    {
        this.startTime = System.currentTimeMillis();
        return this;
    }

    public SystemTime stop()
    {
        this.stopTime = System.currentTimeMillis();
        return this;
    }

    public long getElapsedTime()
    {
        return this.stopTime - this.startTime;
    }
}
