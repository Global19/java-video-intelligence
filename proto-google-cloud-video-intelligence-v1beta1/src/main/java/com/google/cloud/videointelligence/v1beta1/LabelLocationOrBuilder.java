// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta1;

public interface LabelLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta1.LabelLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video segment. Set to [-1, -1] for video-level labels.
   * Set to [timestamp, timestamp] for frame-level labels.
   * Otherwise, corresponds to one of `AnnotateSpec.segments`
   * (if specified) or to shot boundaries (if requested).
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
   */
  boolean hasSegment();
  /**
   *
   *
   * <pre>
   * Video segment. Set to [-1, -1] for video-level labels.
   * Set to [timestamp, timestamp] for frame-level labels.
   * Otherwise, corresponds to one of `AnnotateSpec.segments`
   * (if specified) or to shot boundaries (if requested).
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta1.VideoSegment getSegment();
  /**
   *
   *
   * <pre>
   * Video segment. Set to [-1, -1] for video-level labels.
   * Set to [timestamp, timestamp] for frame-level labels.
   * Otherwise, corresponds to one of `AnnotateSpec.segments`
   * (if specified) or to shot boundaries (if requested).
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta1.VideoSegmentOrBuilder getSegmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Confidence that the label is accurate. Range: [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  float getConfidence();

  /**
   *
   *
   * <pre>
   * Label level.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
   */
  int getLevelValue();
  /**
   *
   *
   * <pre>
   * Label level.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta1.LabelLevel level = 3;</code>
   */
  com.google.cloud.videointelligence.v1beta1.LabelLevel getLevel();
}
