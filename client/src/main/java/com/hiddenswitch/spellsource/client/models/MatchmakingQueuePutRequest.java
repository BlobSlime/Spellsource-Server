/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * MatchmakingQueuePutRequest
 */

public class MatchmakingQueuePutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("queueId")
  private String queueId = null;

  @JsonProperty("deckId")
  private String deckId = null;

  @JsonProperty("botDeckId")
  private String botDeckId = null;

  public MatchmakingQueuePutRequest queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }

   /**
   * Indicates which queue this request is for. 
   * @return queueId
  **/
  @ApiModelProperty(value = "Indicates which queue this request is for. ")
  public String getQueueId() {
    return queueId;
  }

  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  public MatchmakingQueuePutRequest deckId(String deckId) {
    this.deckId = deckId;
    return this;
  }

   /**
   * When set, specifies the deck for this queue. Some queues do not accept deck IDs. 
   * @return deckId
  **/
  @ApiModelProperty(value = "When set, specifies the deck for this queue. Some queues do not accept deck IDs. ")
  public String getDeckId() {
    return deckId;
  }

  public void setDeckId(String deckId) {
    this.deckId = deckId;
  }

  public MatchmakingQueuePutRequest botDeckId(String botDeckId) {
    this.botDeckId = botDeckId;
    return this;
  }

   /**
   * When set, specifies that the bot should play the provided deck. 
   * @return botDeckId
  **/
  @ApiModelProperty(value = "When set, specifies that the bot should play the provided deck. ")
  public String getBotDeckId() {
    return botDeckId;
  }

  public void setBotDeckId(String botDeckId) {
    this.botDeckId = botDeckId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchmakingQueuePutRequest matchmakingQueuePutRequest = (MatchmakingQueuePutRequest) o;
    return Objects.equals(this.queueId, matchmakingQueuePutRequest.queueId) &&
        Objects.equals(this.deckId, matchmakingQueuePutRequest.deckId) &&
        Objects.equals(this.botDeckId, matchmakingQueuePutRequest.botDeckId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, deckId, botDeckId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchmakingQueuePutRequest {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    deckId: ").append(toIndentedString(deckId)).append("\n");
    sb.append("    botDeckId: ").append(toIndentedString(botDeckId)).append("\n");
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

