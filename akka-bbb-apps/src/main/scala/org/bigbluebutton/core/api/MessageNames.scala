package org.bigbluebutton.core.api

object MessageNames {
  val CREATE_MEETING = "create_meeting_request"
  val INITIALIZE_MEETING = "initialize_meeting_request"
  val DESTROY_MEETING = "destroy_meeting_request"
  val START_MEETING = "start_meeting_request"
  val END_MEETING = "end_meeting_request"
  val LOCK_SETTING = "lock_setting_request"
  val LOCK_USER = "lock_user_request"
  val INIT_LOCK_SETTINGS = "init_lock_settings"
  val INIT_AUDIO_SETTINGS = "init_audio_settings"
  val SET_LOCK_SETTINGS = "set_lock_settings"
  val GET_LOCK_SETTINGS = "get_lock_settings"
  val IS_MEETING_LOCKED = "is_meeting_locked"
  val VALIDATE_AUTH_TOKEN = "validate_auth_token_request"
  val VALIDATE_AUTH_TOKEN_REPLY = "validate_auth_token_reply"
  val VALIDATE_AUTH_TOKEN_TIMEOUT = "validate_auth_token_timeout"
  val REGISTER_USER = "register_user_request"
  val USER_JOINING = "user_joining_request"
  val USER_LEAVING = "user_leaving_request"
  val GET_USERS = "get_users_request"
  val EMOJI_STATUS = "emoji_status_hand_request"
  val USER_SHARE_WEBCAM = "user_share_webcam_request"
  val USER_UNSHARE_WEBCAM = "user_unshare_webcam_request"
  val CHANGE_USER_STATUS = "change_user_status_request"
  val CHANGE_USER_ROLE = "change_user_role_request"
  val ASSIGN_PRESENTER = "assign_presenter_request"
  val SET_RECORDING_STATUS = "set_recording_status_request"
  val GET_CHAT_HISTORY = "get_chat_history_request"
  val SEND_PUBLIC_MESSAGE = "send_public_chat_message_request"
  val SEND_PRIVATE_MESSAGE = "send_private_chat_message_request"
  val GET_CURRENT_LAYOUT = "get_current_layout_request"
  val SET_LAYOUT = "set_layout_request"
  val BROADCAST_LAYOUT = "broadcast_layout_request"
  val UNLOCK_LAYOUT = "unlock_layout_request"
  val PRECREATED_POLL = "precreated_poll_request"
  val CREATE_POLL = "create_poll_request"
  val UPDATE_POLL = "update_poll_request"
  val GET_POLLS = "get_polls_request"
  val DESTROY_POLL = "destroy_poll_request"
  val REMOVE_POLL = "remove_poll_request"
  val SHARE_POLL = "share_poll_request"
  val SHOW_POLL_RESULT = "show_poll_result_request"
  val HIDE_POLL_RESULT = "hide_poll_result_request"
  val START_POLL = "start_poll_request"
  val STOP_POLL = "stop_poll_request"
  val CLEAR_POLL = "clear_poll_request"
  val GET_POLL_RESULT = "get_poll_result_request"
  val RESPONT_TO_POLL = "respond_to_poll_request"
  val CLEAR_PRESENTATION = "clear_presentation_request"
  val REMOVE_PRESENTATION = "remove_presentation_request"
  val GET_PRESENTATION_INFO = "get_presentation_info_request"
  val RESIZE_AND_MOVE_SLIDE = "resize_and_move_slide_request"
  val GO_TO_SLIDE = "go_to_slide_request"
  val SHARE_PRESENTATION = "share_presentation_request"
  val GET_SLIDE_INFO = "get_slide_info_request"
  val GET_SLIDE_INFO_REPLY = "get_slide_info_reply"
  val PREUPLOADED_PRESENTATIONS = "preuploaded_presentation_request"
  val PRESENTATION_CONVERSION_UPDATE = "presentation_conversion_update_message"
  val PRESENTATION_PAGE_COUNT_ERROR = "presentation_page_count_error_message"
  val PRESENTATION_SLIDE_GENERATED = "presentation_slide_generated_message"
  val PRESENTATION_CONVERSION_COMPLETED = "presentation_conversion_completed_message"
  val PRESENTATION_CURSOR_UPDATED = "presentation_cursor_updated_message"
  val SEND_VOICE_USERS_REQUEST = "send_voice_users_request"
  val MUTE_MEETING_REQUEST = "mute_meeting_request"
  val IS_MEETING_MUTED = "is_meeting_muted_request"
  val MUTE_USER = "mute_user_request"
  val EJECT_USER = "eject_user_request"
  val VOICE_USER_JOINED_MESSAGE = "voice_user_joined_message"
  val VOICE_USER_JOINED = "voice_user_joined"
  val VOICE_USER_LEFT = "voice_user_left_message"
  val VOICE_USER_LOCKED = "voice_user_locked_message"
  val VOICE_USER_MUTED = "voice_user_muted_message"
  val VOICE_USER_TALKING = "voice_user_talking_message"
  val VOICE_RECORDING = "voice_recording_message"
  val SEND_WHITEBOARD_ANNOTATION = "send_whiteboard_annotation_request"
  val GET_WHITEBOARD_SHAPES = "get_whiteboard_shapes_request"
  val CLEAR_WHITEBOARD = "clear_whiteboard_request"
  val UNDO_WHITEBOARD = "undo_whiteboard_request"
  val ENABLE_WHITEBOARD = "enable_whiteboard_request"
  val IS_WHITEBOARD_ENABLED = "is_whiteboard_enabled_request"
  var GET_GUEST_POLICY = "get_guest_policy"
  val SET_GUEST_POLICY = "set_guest_policy"
  val RESPOND_TO_GUEST = "respond_to_guest"
  val GET_ALL_MEETINGS_REQUEST = "get_all_meetings_request"

  // OUT MESSAGES
  val MEETING_CREATED = "meeting_created_message"
  val VOICE_RECORDING_STARTED = "voice_recording_started_message"
  val VOICE_RECORDING_STOPPED = "voice_recording_stopped_message"
  val RECORDING_STATUS_CHANGED = "recording_status_changed_message"
  val GET_RECORDING_STATUS_REPLY = "get_recording_status_reply"
  val MEETING_ENDED = "meeting_ended_message"
  val MEETING_HAS_ENDED = "meeting_has_ended_message"
  val MEETING_STATE = "meeting_state_message"
  val MEETING_MUTED = "meeting_muted_message"
  val MEETING_DESTROYED = "meeting_destroyed_message"
  val DISCONNECT_ALL_USERS = "disconnect_all_users_message"
  val DISCONNECT_USER = "disconnect_user_message"
  val PERMISSION_SETTING_INITIALIZED = "permisssion_setting_initialized_message"
  val NEW_PERMISSION_SETTINGS = "new_permission_settings"
  val USER_LOCKED = "user_locked_message"
  val USERS_LOCKED = "users_locked_message"
  val GET_PERMISSION_SETTINGS_REPLY = "get_permissions_setting_reply"
  val IS_MEETING_LOCKED_REPLY = "is_meeting_locked_reply"
  val USER_REGISTERED = "user_registered_message"
  val USER_LEFT = "user_left_message"
  val PRESENTER_ASSIGNED = "presenter_assigned_message"
  val END_AND_KICK_ALL = "end_and_kick_all_message"
  val GET_USERS_REPLY = "get_users_reply"
  val USER_JOINED = "user_joined_message"
  val USER_EMOJI_STATUS = "user_emoji_status_message"
  val USER_SHARED_WEBCAM = "user_shared_webcam_message"
  val USER_UNSHARED_WEBCAM = "user_unshared_webcam_message"
  val USER_STATUS_CHANGED = "user_status_changed_message"
  val USER_ROLE_CHANGED = "user_role_changed_message"
  val MUTE_VOICE_USER = "mute_voice_user_request"
  val USER_VOICE_MUTED = "user_voice_muted_message"
  val USER_VOICE_TALKING = "user_voice_talking_message"
  val EJECT_VOICE_USER = "eject_voice_user_message"
  val USER_JOINED_VOICE = "user_joined_voice_message"
  val USER_LEFT_VOICE = "user_left_voice_message"
  val IS_MEETING_MUTED_REPLY = "is_meeting_muted_reply"
  val START_RECORDING = "start_recording_message"
  val STOP_RECORDING = "stop_recording_message"
  val GET_CHAT_HISTORY_REPLY = "get_chat_history_reply"
  val SEND_PUBLIC_CHAT_MESSAGE = "send_public_chat_message"
  val SEND_PRIVATE_CHAT_MESSAGE = "send_private_chat_message"
  val GET_CURRENT_LAYOUT_REPLY = "get_current_layout_reply"
  val SET_LAYOUT_REPLY = "set_layout_reply"
  val BROADCAST_LAYOUT_REPLY = "broadcast_layout_reply"
  val UNLOCK_LAYOUT_REPLY = "unlock_layout_reply"
  val GET_POLL_RESULT_REPLY = "get_poll_result_reply"
  val POLL_CLEARED = "poll_cleared_message"
  val GET_POLLS_REPLY = "get_polls_reply"
  val CLEAR_POLL_FAILED = "clear_poll_failed"
  val POLL_STARTED = "poll_started_message"
  val POLL_STOPPED = "poll_stopped_message"
  val POLL_REMOVED = "poll_removed"
  val POLL_UPDATED = "poll_updated_message"
  val POLL_CREATED = "poll_created_message"
  val POLL_RESPONSE = "poll_response_message"
  val POLL_HIDE_RESULT = "poll_hide_result_message"
  val POLL_SHOW_RESULT = "poll_show_result_message"
  val PRESENTATION_CLEARED = "presentation_cleared_message"
  val PRESENTATION_REMOVED = "presentation_removed_message"
  val GET_PRESENTATION_INFO_REPLY = "get_presentation_info_reply"
  val PRESENTATION_PAGE_RESIZED = "presentation_page_resized_message"
  val PRESENTATION_PAGE_CHANGED = "presentation_page_changed_message"
  val PRESENTATION_SHARED = "presentation_shared_message"
  val GET_PREUPLOADED_PRESENTATIONS = "get_preuploaded_presentations_message"
  val PRESENTATION_CONVERSION_PROGRESS = "presentation_conversion_progress_message"
  val PRESENTATION_CONVERSION_ERROR = "presentation_conversion_error_message"
  val PRESENTATION_CONVERSION_DONE = "presentation_conversion_done_message"
  val PRESENTATION_CHANGED = "presentation_changed_message"
  val GET_PRESENTATION_STATUS_REPLY = "get_presentation_status_reply"
  val PRESENTATION_REMOVED_MESSAGE = "presentation_removed_message"
  val PRESENTATION_PAGE_GENERATED = "presentation_page_generated_message"
  val GET_WHITEBOARD_SHAPES_REPLY = "get_whiteboard_shapes_reply"
  val SEND_WHITEBOARD_SHAPE = "send_whiteboard_shape_message"
  val UNDO_WHITEBOARD_MESSAGE = "undo_whiteboard_message"
  val WHITEBOARD_ENABLED = "whiteboard_enabled_message"
  val WHITEBOARD_CLEARED = "whiteboard_cleared_message"
  val IS_WHITEBOARD_ENABLED_REPLY = "is_whiteboard_enabled_reply"
  val MEETING_DESTROYED_EVENT = "meeting_destroyed_event"
  val KEEP_ALIVE_REPLY = "keep_alive_reply"
  val USER_LISTEN_ONLY = "user_listening_only"
  var GET_GUEST_POLICY_REPLY = "get_guest_policy_reply"
  val GUEST_POLICY_CHANGED = "guest_policy_changed"
  val GUEST_ACCESS_DENIED = "guest_access_denied"
  val PATCH_DOCUMENT_REPLY = "patch_document_reply"
  val GET_CURRENT_DOCUMENT_REPLY = "get_current_document_reply"
  val CREATE_ADDITIONAL_NOTES_REPLY = "create_additional_notes_reply"
  val DESTROY_ADDITIONAL_NOTES_REPLY = "destroy_additional_notes_reply"
  val GET_ALL_MEETINGS_REPLY = "get_all_meetings_reply"
}