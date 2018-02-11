/**
 * Copyright 2018 Symphony Communication Services, LLC.
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.symphonyoss.s2.canon.example.presence.server;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import org.symphonyoss.s2.canon.example.presence.canon.UsersUserIdTestPathHandler;
import org.symphonyoss.s2.canon.example.presence.facade.IPresence;
import org.symphonyoss.s2.canon.example.presence.facade.UserId;
import org.symphonyoss.s2.canon.example.presence.facade.UserPresence;
import org.symphonyoss.s2.canon.runtime.exception.JapiException;

/**
 * Facade for Path name=UsersUserIdTest
 *
 * Manipulate a single user's presence.
 *
 * Path					/users/{userId}/test
 * Bind Path			users/
 */
@Immutable
public class UsersUserIdTestHandler extends UsersUserIdTestPathHandler
{
  public UsersUserIdTestHandler(IPresence model)
  {
    super(model);
  }
  
  /**
   * get /users/{userId}/test
   * Fetch a single user's presence.
   * 
   * userId                    A Symphony external user ID.
   * @return A UserPresence
   * @throws PermissionDeniedException        If the caller lacks necessary entitlements for the action
   * @throws ServerErrorException             If an unexpected error occurred
   */
  @Override
  public @Nonnull UserPresence handleGet(
    @Nonnull  UserId                    userId
  )
  throws JapiException
  	{
  	   // TODO Auto-generated method stub
    return null;
	}

}