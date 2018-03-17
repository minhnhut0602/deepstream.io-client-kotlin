package deepstream.constant

enum class CONNECTION_STATE {
    CLOSING,
    CLOSED,
    INITIALISING,
    AWAITING_CONNECTION,
    CHALLENGING,
    AWAITING_AUTHENTICATION,
    AUTHENTICATING,
    OPEN,
    ERROR,
    RECONNECTING,
    REDIRECTING,
    CHALLENGE_DENIED,
    TOO_MANY_AUTH_ATTEMPTS,
    AUTHENTICATION_TIMEOUT,
    PAUSING,
    OFFLINE
}