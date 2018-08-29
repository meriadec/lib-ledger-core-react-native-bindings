// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

#ifndef DJINNI_GENERATED_WEBSOCKETCONNECTION_HPP
#define DJINNI_GENERATED_WEBSOCKETCONNECTION_HPP

#include <cstdint>
#include <string>

namespace ledger { namespace core { namespace api {

enum class ErrorCode;

class WebSocketConnection {
public:
    virtual ~WebSocketConnection() {}

    virtual void onConnect(int32_t connectionId) = 0;

    virtual void onClose() = 0;

    virtual void onMessage(const std::string & data) = 0;

    virtual void onError(ErrorCode code, const std::string & message) = 0;

    virtual int32_t getConnectionId() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_WEBSOCKETCONNECTION_HPP
