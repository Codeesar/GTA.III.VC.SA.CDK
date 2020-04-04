#include "TextDrawer.h"

TextDrawer textDrawer;

void TextDrawer::DrawPrints()
{
	for(int i = 0; i < m_dwNumPrintsThisFrame; i++)
	{
		CFont::SetScale(m_aPrints[i].m_fWidth, m_aPrints[i].m_fHeight);
		CFont::SetFontStyle(m_aPrints[i].m_nStyle);
		CFont::SetProp(m_aPrints[i].m_nProp);
		CFont::SetJustify(m_aPrints[i].m_nJustify);
		CFont::SetAlignment((eFontAlignment)m_aPrints[i].m_nAlign);
		if(m_aPrints[i].m_nOutline || m_aPrints[i].m_nShadow)
		{
			if(m_aPrints[i].m_nOutline)
				CFont::SetOutlinePosition(m_aPrints[i].m_nOutline);
			else
				CFont::SetDropShadowPosition(m_aPrints[i].m_nShadow);
			CFont::SetDropColor(m_aPrints[i].m_DropColor);
		}
		else
		{
			CFont::SetOutlinePosition(0);
			CFont::SetDropShadowPosition(0);
		}
		if(m_aPrints[i].m_nBackground)
		{
			CFont::SetBackground(m_aPrints[i].m_nBackground, false);
			CFont::SetBackgroundColor(m_aPrints[i].m_BackColor);
		}
		else
			CFont::SetBackground(false, false);
		CFont::SetColor(m_aPrints[i].m_Color);
		switch(m_aPrints[i].m_nAlign)
		{
			case ALIGN_LEFT:
				CFont::SetWrapx(m_aPrints[i].m_fWrap); break;
			case ALIGN_CENTER:
				CFont::SetCentreSize(m_aPrints[i].m_fWrap); break;
			case ALIGN_RIGHT:
				CFont::SetRightJustifyWrap(m_aPrints[i].m_fWrap); break;
		}
		CFont::PrintString(m_aPrints[i].m_fX, m_aPrints[i].m_fY, m_aPrints[i].m_text);
	}
	m_dwNumPrintsThisFrame = 0;
}