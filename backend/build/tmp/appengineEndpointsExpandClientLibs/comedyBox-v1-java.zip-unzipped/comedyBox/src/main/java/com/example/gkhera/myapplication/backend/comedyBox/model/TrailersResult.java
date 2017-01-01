/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2017-01-01 at 20:13:14 UTC 
 * Modify at your own risk.
 */

package com.example.gkhera.myapplication.backend.comedyBox.model;

/**
 * Model definition for TrailersResult.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the comedyBox. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrailersResult extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Trailer> results;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public TrailersResult setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Trailer> getResults() {
    return results;
  }

  /**
   * @param results results or {@code null} for none
   */
  public TrailersResult setResults(java.util.List<Trailer> results) {
    this.results = results;
    return this;
  }

  @Override
  public TrailersResult set(String fieldName, Object value) {
    return (TrailersResult) super.set(fieldName, value);
  }

  @Override
  public TrailersResult clone() {
    return (TrailersResult) super.clone();
  }

}
