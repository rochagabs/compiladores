/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class AVazioTipoRetorno extends PTipoRetorno
{
    private TPalavraVazio _palavraVazio_;

    public AVazioTipoRetorno()
    {
        // Constructor
    }

    public AVazioTipoRetorno(
        @SuppressWarnings("hiding") TPalavraVazio _palavraVazio_)
    {
        // Constructor
        setPalavraVazio(_palavraVazio_);

    }

    @Override
    public Object clone()
    {
        return new AVazioTipoRetorno(
            cloneNode(this._palavraVazio_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVazioTipoRetorno(this);
    }

    public TPalavraVazio getPalavraVazio()
    {
        return this._palavraVazio_;
    }

    public void setPalavraVazio(TPalavraVazio node)
    {
        if(this._palavraVazio_ != null)
        {
            this._palavraVazio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._palavraVazio_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._palavraVazio_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._palavraVazio_ == child)
        {
            this._palavraVazio_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._palavraVazio_ == oldChild)
        {
            setPalavraVazio((TPalavraVazio) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
