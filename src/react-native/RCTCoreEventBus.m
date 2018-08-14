// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

#import "RCTCoreEventBus.h"


@implementation RCTCoreEventBus
//Export module
RCT_EXPORT_MODULE(RCTCoreEventBus)

@synthesize bridge = _bridge;

-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
    }
    return self;
}

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}

/**
 *Subscribe an event receiver to the event bus
 *@param context, ExecutionContext object, execution context in which receiver will be notified
 *@param reveiver, EventReceiver object, receiver that event bu will notify
 */
RCT_REMAP_METHOD(subscribe,subscribe:(NSDictionary *)currentInstance withParams:(NSDictionary *)context
                                                                       receiver:(NSDictionary *)receiver withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreEventBus::subscribe, first argument should be an instance of EventBus", nil);
    }
    EventBus *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling EventBus::subscribe, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreExecutionContext *rctParam_context = (RCTCoreExecutionContext *)[self.bridge moduleForName:@"CoreExecutionContext"];
    id<ExecutionContext>objcParam_0 = (id<ExecutionContext>)[rctParam_context.objcImplementations objectForKey:context[@"uid"]];
    RCTCoreEventReceiver *rctParam_receiver = (RCTCoreEventReceiver *)[self.bridge moduleForName:@"CoreEventReceiver"];
    id<EventReceiver>objcParam_1 = (id<EventReceiver>)[rctParam_receiver.objcImplementations objectForKey:receiver[@"uid"]];
    [currentInstanceObj subscribe:objcParam_0 receiver:objcParam_1];

}

/**
 *Unsubscribe an event receiver from the event bus
 *@param receiver, EventReceiver object, receiver to unsubscribe
 */
RCT_REMAP_METHOD(unsubscribe,unsubscribe:(NSDictionary *)currentInstance withParams:(NSDictionary *)receiver withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreEventBus::unsubscribe, first argument should be an instance of EventBus", nil);
    }
    EventBus *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling EventBus::unsubscribe, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreEventReceiver *rctParam_receiver = (RCTCoreEventReceiver *)[self.bridge moduleForName:@"CoreEventReceiver"];
    id<EventReceiver>objcParam_0 = (id<EventReceiver>)[rctParam_receiver.objcImplementations objectForKey:receiver[@"uid"]];
    [currentInstanceObj unsubscribe:objcParam_0];

}
@end