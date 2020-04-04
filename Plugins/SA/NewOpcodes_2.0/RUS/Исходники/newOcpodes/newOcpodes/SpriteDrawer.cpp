#include "SpriteDrawer.h"
#include "game_sa\CSprite2d.h"
#include <math.h>

SpriteDrawer spriteDrawer;

void RotateVertices(CVector2D *rect, unsigned int numVerts, float x, float y, float angle)
{
	float xold, yold;
	float _cos = cos(angle);
	float _sin = sin(angle);
	for(unsigned int i = 0; i < numVerts; i++)
	{
	    xold = rect[i].x;
	    yold = rect[i].y;
	    rect[i].x = x + (xold - x) * _cos + (yold - y) * _sin;
	    rect[i].y = y - (xold - x) * _sin + (yold - y) * _cos;
	}
}

void NOSprite::Draw()
{
	CVector2D vertices[4];
	if(m_pTexture)
		RwEngineInstance->dOpenDevice.fpRenderStateSet(rwRENDERSTATETEXTURERASTER, m_pTexture->raster);
	else
		RwEngineInstance->dOpenDevice.fpRenderStateSet(rwRENDERSTATETEXTURERASTER, NULL);
	if(m_angle != 0.0f)
	{
		vertices[0].x = m_rect.m_fLeft; vertices[0].y = m_rect.m_fBottom;
		vertices[1].x = m_rect.m_fRight; vertices[1].y = m_rect.m_fBottom;
		vertices[2].x = m_rect.m_fLeft; vertices[2].y = m_rect.m_fTop;
		vertices[3].x = m_rect.m_fRight; vertices[3].y = m_rect.m_fTop;
		RotateVertices(vertices, 4, m_rect.m_fLeft + (m_rect.m_fRight - m_rect.m_fLeft)/2.0f, m_rect.m_fTop + 
			(m_rect.m_fBottom - m_rect.m_fTop)/2.0f, m_angle);
		CSprite2d::DrawAnyRect(vertices[0].x, vertices[0].y, vertices[1].x, vertices[1].y, vertices[2].x, vertices[2].y,
			vertices[3].x, vertices[3].y, m_color[0], m_color[1], m_color[2], m_color[3]);
	}
	else
	{
		CSprite2d::DrawAnyRect(m_rect.m_fLeft, m_rect.m_fBottom, m_rect.m_fRight, m_rect.m_fBottom, m_rect.m_fLeft,
			m_rect.m_fTop, m_rect.m_fRight, m_rect.m_fTop, m_color[0], m_color[1], m_color[2], m_color[3]);
	}	
}

SpriteDrawer::SpriteDrawer()
{
	m_numSpritesThisFrame = 0;
}

void SpriteDrawer::DrawSpriteThisFrame(RwTexture *texture, CRect const& rect, CRGBA const& color1, CRGBA const& color2, 
									   CRGBA const& color3, CRGBA const& color4, float angle)
{
	if(m_numSpritesThisFrame < MAX_NO_SPRITES)
	{
		m_sprites[m_numSpritesThisFrame].m_rect = rect;
		m_sprites[m_numSpritesThisFrame].m_color[0] = color1;
		m_sprites[m_numSpritesThisFrame].m_color[1] = color2;
		m_sprites[m_numSpritesThisFrame].m_color[2] = color3;
		m_sprites[m_numSpritesThisFrame].m_color[3] = color1;
		m_sprites[m_numSpritesThisFrame].m_pTexture = texture;
		m_sprites[m_numSpritesThisFrame].m_angle = angle / 57.2957795f;
		m_numSpritesThisFrame++;
	}
}

void SpriteDrawer::DrawSprites()
{
	for(unsigned int i = 0; i < m_numSpritesThisFrame; i++)
		m_sprites[i].Draw();
}

void SpriteDrawer::Reset()
{
	m_numSpritesThisFrame = 0;
}