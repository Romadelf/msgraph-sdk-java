// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Planner Plan With Reference Request.
 */
public interface IPlannerPlanWithReferenceRequest extends IHttpRequest {

    void post(final PlannerPlan newPlannerPlan, final IJsonBackedObject payload, final ICallback<PlannerPlan> callback);

    PlannerPlan post(final PlannerPlan newPlannerPlan, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<PlannerPlan> callback);

    PlannerPlan get() throws ClientException;

	void delete(final ICallback<PlannerPlan> callback);

	void delete() throws ClientException;

	void patch(final PlannerPlan sourcePlannerPlan, final ICallback<PlannerPlan> callback);

	PlannerPlan patch(final PlannerPlan sourcePlannerPlan) throws ClientException;

    IPlannerPlanWithReferenceRequest select(final String value);

    IPlannerPlanWithReferenceRequest expand(final String value);

}