// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TokenLifetimePolicy;
import com.microsoft.graph.requests.extensions.ITokenLifetimePolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Token Lifetime Policy Collection Page.
 */
public class TokenLifetimePolicyCollectionPage extends BaseCollectionPage<TokenLifetimePolicy, ITokenLifetimePolicyCollectionRequestBuilder> implements ITokenLifetimePolicyCollectionPage {

    /**
     * A collection page for TokenLifetimePolicy
     *
     * @param response the serialized TokenLifetimePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TokenLifetimePolicyCollectionPage(final TokenLifetimePolicyCollectionResponse response, final ITokenLifetimePolicyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
