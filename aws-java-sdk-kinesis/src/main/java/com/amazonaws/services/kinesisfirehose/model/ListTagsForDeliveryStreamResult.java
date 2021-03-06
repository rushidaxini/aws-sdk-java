/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ListTagsForDeliveryStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForDeliveryStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     * <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     * <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     * <code>ListTagsForDeliveryStream</code> again.
     * </p>
     */
    private Boolean hasMoreTags;

    /**
     * <p>
     * A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     * <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * </p>
     * 
     * @return A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     *         <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     * <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     *        <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     * <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     *        <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForDeliveryStreamResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     * <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with <code>DeliveryStreamName</code>, starting with the first tag after
     *        <code>ExclusiveStartTagKey</code> and up to the specified <code>Limit</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForDeliveryStreamResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     * <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     * <code>ListTagsForDeliveryStream</code> again.
     * </p>
     * 
     * @param hasMoreTags
     *        If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     *        <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     *        <code>ListTagsForDeliveryStream</code> again.
     */

    public void setHasMoreTags(Boolean hasMoreTags) {
        this.hasMoreTags = hasMoreTags;
    }

    /**
     * <p>
     * If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     * <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     * <code>ListTagsForDeliveryStream</code> again.
     * </p>
     * 
     * @return If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     *         <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     *         <code>ListTagsForDeliveryStream</code> again.
     */

    public Boolean getHasMoreTags() {
        return this.hasMoreTags;
    }

    /**
     * <p>
     * If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     * <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     * <code>ListTagsForDeliveryStream</code> again.
     * </p>
     * 
     * @param hasMoreTags
     *        If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     *        <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     *        <code>ListTagsForDeliveryStream</code> again.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForDeliveryStreamResult withHasMoreTags(Boolean hasMoreTags) {
        setHasMoreTags(hasMoreTags);
        return this;
    }

    /**
     * <p>
     * If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     * <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     * <code>ListTagsForDeliveryStream</code> again.
     * </p>
     * 
     * @return If this is <code>true</code> in the response, more tags are available. To list the remaining tags, set
     *         <code>ExclusiveStartTagKey</code> to the key of the last tag returned and call
     *         <code>ListTagsForDeliveryStream</code> again.
     */

    public Boolean isHasMoreTags() {
        return this.hasMoreTags;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getHasMoreTags() != null)
            sb.append("HasMoreTags: ").append(getHasMoreTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForDeliveryStreamResult == false)
            return false;
        ListTagsForDeliveryStreamResult other = (ListTagsForDeliveryStreamResult) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getHasMoreTags() == null ^ this.getHasMoreTags() == null)
            return false;
        if (other.getHasMoreTags() != null && other.getHasMoreTags().equals(this.getHasMoreTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getHasMoreTags() == null) ? 0 : getHasMoreTags().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForDeliveryStreamResult clone() {
        try {
            return (ListTagsForDeliveryStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
