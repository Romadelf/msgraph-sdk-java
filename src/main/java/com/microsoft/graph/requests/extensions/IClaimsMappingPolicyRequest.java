// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ClaimsMappingPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Claims Mapping Policy Request.
 */
public interface IClaimsMappingPolicyRequest extends IHttpRequest {

    /**
     * Gets the ClaimsMappingPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ClaimsMappingPolicy> callback);

    /**
     * Gets the ClaimsMappingPolicy from the service
     *
     * @return the ClaimsMappingPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ClaimsMappingPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ClaimsMappingPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ClaimsMappingPolicy with a source
     *
     * @param sourceClaimsMappingPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ClaimsMappingPolicy sourceClaimsMappingPolicy, final ICallback<ClaimsMappingPolicy> callback);

    /**
     * Patches this ClaimsMappingPolicy with a source
     *
     * @param sourceClaimsMappingPolicy the source object with updates
     * @return the updated ClaimsMappingPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ClaimsMappingPolicy patch(final ClaimsMappingPolicy sourceClaimsMappingPolicy) throws ClientException;

    /**
     * Posts a ClaimsMappingPolicy with a new object
     *
     * @param newClaimsMappingPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ClaimsMappingPolicy newClaimsMappingPolicy, final ICallback<ClaimsMappingPolicy> callback);

    /**
     * Posts a ClaimsMappingPolicy with a new object
     *
     * @param newClaimsMappingPolicy the new object to create
     * @return the created ClaimsMappingPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ClaimsMappingPolicy post(final ClaimsMappingPolicy newClaimsMappingPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IClaimsMappingPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IClaimsMappingPolicyRequest expand(final String value);

}

