/**
 * Hidden Switch Minionate API
 * The Minionate API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hiddenswitch.proto3.net.client.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.hiddenswitch.proto3.net.client.models.InventoryCollection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DecksGetResponse
 */

public class DecksGetResponse  implements Serializable {
  @SerializedName("collection")
  private InventoryCollection collection = null;

  @SerializedName("inventoryIdsSize")
  private Integer inventoryIdsSize = null;

  public DecksGetResponse collection(InventoryCollection collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  @ApiModelProperty(example = "null", value = "")
  public InventoryCollection getCollection() {
    return collection;
  }

  public void setCollection(InventoryCollection collection) {
    this.collection = collection;
  }

  public DecksGetResponse inventoryIdsSize(Integer inventoryIdsSize) {
    this.inventoryIdsSize = inventoryIdsSize;
    return this;
  }

   /**
   * The current number of cards in this deck. 
   * @return inventoryIdsSize
  **/
  @ApiModelProperty(example = "null", value = "The current number of cards in this deck. ")
  public Integer getInventoryIdsSize() {
    return inventoryIdsSize;
  }

  public void setInventoryIdsSize(Integer inventoryIdsSize) {
    this.inventoryIdsSize = inventoryIdsSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecksGetResponse decksGetResponse = (DecksGetResponse) o;
    return Objects.equals(this.collection, decksGetResponse.collection) &&
        Objects.equals(this.inventoryIdsSize, decksGetResponse.inventoryIdsSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, inventoryIdsSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecksGetResponse {\n");
    
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    inventoryIdsSize: ").append(toIndentedString(inventoryIdsSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

