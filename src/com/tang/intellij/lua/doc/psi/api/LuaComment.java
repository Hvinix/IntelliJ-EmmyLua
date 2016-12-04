package com.tang.intellij.lua.doc.psi.api;

import com.intellij.psi.PsiComment;
import com.tang.intellij.lua.doc.psi.LuaDocClassDef;
import com.tang.intellij.lua.doc.psi.LuaDocParamDef;
import com.tang.intellij.lua.doc.psi.LuaDocPsiElement;
import com.tang.intellij.lua.doc.psi.LuaDocTypeDef;
import com.tang.intellij.lua.psi.LuaCommentOwner;

/**
 * Created by Tangzx on 2016/11/21.
 *
 * @qq 272669294
 */
public interface LuaComment extends PsiComment, LuaDocPsiElement {
    LuaCommentOwner getOwner();
    LuaDocParamDef getParamDef(String name);
    LuaDocClassDef getClassDef();
    LuaDocTypeDef getTypeDef();
}