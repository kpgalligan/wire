// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.SomeService in service_kotlin.proto
package com.squareup.wire.protos.kotlin.services

import com.squareup.wire.GrpcCall
import com.squareup.wire.Service

interface SomeServiceClient : Service {
  fun SomeMethod(): GrpcCall<SomeRequest, SomeResponse>
}
