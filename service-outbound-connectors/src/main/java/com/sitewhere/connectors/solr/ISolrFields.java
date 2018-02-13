/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.connectors.solr;

/**
 * Contains constants for Solr field names.
 * 
 * @author Derek
 */
public interface ISolrFields {

    /** Unique device event identifier */
    public static final String EVENT_ID = "eventId";

    /** Event type indicator */
    public static final String EVENT_TYPE = "eventType";

    /** Unique device assignment identifier */
    public static final String ASSIGNMENT_TOKEN = "assignmentToken";

    /** Assignment type indicator */
    public static final String ASSIGNMENT_TYPE = "assignmentType";

    /** Asset reference */
    public static final String ASSET_REFERENCE = "assetReference";

    /** Unique area identifier */
    public static final String AREA_ID = "areaId";

    /** Event date */
    public static final String EVENT_DATE = "eventDate";

    /** Event received date */
    public static final String RECEIVED_DATE = "receivedDate";

    /** Location */
    public static final String LOCATION = "location";

    /** Elevation */
    public static final String ELEVATION = "elevation";

    /** Alert type */
    public static final String ALERT_TYPE = "alertType";

    /** Alert message */
    public static final String ALERT_MESSAGE = "alertMessage";

    /** Alert level */
    public static final String ALERT_LEVEL = "alertLevel";

    /** Alert source */
    public static final String ALERT_SOURCE = "alertSource";

    /** Prefix for metadata fields */
    public static final String META_PREFIX = "meta.";

    /** Location latitude */
    public static final String MEASUREMENT_PREFIX = "mx.";
}