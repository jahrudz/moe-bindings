package org.moe.binding.firebaseinstanceid;


import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FirebaseInstanceID")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class FIRInstanceID extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected FIRInstanceID(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Owned
	@Selector("alloc")
	public static native FIRInstanceID alloc();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
	public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
			@Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object anArgument);

	@Generated
	@Selector("class")
	public static native Class class_objc_static();

	@Generated
	@Selector("classFallbacksForKeyedArchiver")
	public static native NSArray<String> classFallbacksForKeyedArchiver();

	@Generated
	@Selector("classForKeyedUnarchiver")
	public static native Class classForKeyedUnarchiver();

	@Generated
	@Selector("debugDescription")
	public static native String debugDescription_static();

	@Generated
	@Selector("deleteIDWithHandler:")
	public native void deleteIDWithHandler(
			@ObjCBlock(name = "call_deleteIDWithHandler") Block_deleteIDWithHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteIDWithHandler {
		@Generated
		void call_deleteIDWithHandler(NSError arg0);
	}

	@Generated
	@Selector("deleteTokenWithAuthorizedEntity:scope:handler:")
	public native void deleteTokenWithAuthorizedEntityScopeHandler(
			String authorizedEntity,
			String scope,
			@ObjCBlock(name = "call_deleteTokenWithAuthorizedEntityScopeHandler") Block_deleteTokenWithAuthorizedEntityScopeHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_deleteTokenWithAuthorizedEntityScopeHandler {
		@Generated
		void call_deleteTokenWithAuthorizedEntityScopeHandler(NSError arg0);
	}

	@Generated
	@Selector("description")
	public static native String description_static();

	@Generated
	@Selector("getIDWithHandler:")
	public native void getIDWithHandler(
			@ObjCBlock(name = "call_getIDWithHandler") Block_getIDWithHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_getIDWithHandler {
		@Generated
		void call_getIDWithHandler(String arg0, NSError arg1);
	}

	@Generated
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("init")
	public native FIRInstanceID init();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceID")
	public static native FIRInstanceID instanceID();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setAPNSToken:type:")
	public native void setAPNSTokenType(NSData token, @NInt long type);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("token")
	public native String token();

	@Generated
	@Selector("tokenWithAuthorizedEntity:scope:options:handler:")
	public native void tokenWithAuthorizedEntityScopeOptionsHandler(
			String authorizedEntity,
			String scope,
			NSDictionary<?, ?> options,
			@ObjCBlock(name = "call_tokenWithAuthorizedEntityScopeOptionsHandler") Block_tokenWithAuthorizedEntityScopeOptionsHandler handler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_tokenWithAuthorizedEntityScopeOptionsHandler {
		@Generated
		void call_tokenWithAuthorizedEntityScopeOptionsHandler(String arg0,
				NSError arg1);
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}